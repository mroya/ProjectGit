package cursojavadeitel.exercicios_Cap6;

	import java.io.*;
	import java.net.*;
	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	import javax.swing.JPanel;

	@SuppressWarnings("serial")
	public class Cliente extends JFrame {
	   private JTextField jtfEntradaTexto;
	   private JTextArea jtaSaidaTexto;
	   private ObjectOutputStream oosSaidaDados;
	   private ObjectInputStream oisEntradaDados;
	   private String vMensagem = "";
	   private String vServidor;
	   private Socket sCliente;
	    private JPanel jPainel = new JPanel();
	    private BorderLayout borderLayout = new BorderLayout();

	    // inicializa a GUI
	   public Cliente( String host )
	   {
	      super( "Cliente" );

	      // repassa o endereço do servidor
	      vServidor = host;

	      Container container = getContentPane();
		  jPainel.setLayout(borderLayout);
	      jtfEntradaTexto = new JTextField();
	      jtfEntradaTexto.setEnabled( false );
	      jtfEntradaTexto.setForeground(new Color(100,100,200));
	      jtfEntradaTexto.addActionListener(

	         new ActionListener() {

	            // envia a mensagem para o servidor
	            public void actionPerformed( ActionEvent event )
	            {
	               enviaMensagem( event.getActionCommand() );
	            }

	         }  

	      );

	      jPainel.add( jtfEntradaTexto, BorderLayout.NORTH );

	      jtaSaidaTexto = new JTextArea();
	      jtaSaidaTexto.setForeground(new Color(200,100,100));
	      jPainel.add( new JScrollPane( jtaSaidaTexto ),
	         BorderLayout.CENTER );
	      container.add(jPainel, null);
	      setSize( 300, 150 );
	      setVisible( true );
	   }


	    // conecta ao servidor e processa as mensagens trocadas com servidor
	   public void runCliente() 
	   {
	      // conecta ao servidor, obtem fluxos, processa conexao
	      try {

	         // Step 1: Cria o Socket para a conexao
	         conectarServidor();

	         // Step 2: obtem os fluxos de entrada e saida de dados
	         obterFluxos();

	         // Step 3: Processa conexao
	         processaConexao();

	         // Step 4: encerra a conexao
	         encerrarConexao();
	      }

	      // caso ocorra uma EOFException imprime no console
	      catch ( EOFException eofException ) {
	         System.out.println( "Server terminated connection" );
	      }

	      // caso ocorra uma IOException imprime no console a stacktrace
	      catch ( IOException ioException ) {
	         ioException.printStackTrace();
	      }
	   }

	   // obtem os fluxos de envio e recebimento de mensagens
	   private void obterFluxos() throws IOException
	   {
	      // obtem o fluxo de saida da mensagem
	      oosSaidaDados = new ObjectOutputStream(
	         sCliente.getOutputStream() );

	      // envia os dados
	      oosSaidaDados.flush();

	      // obtem o fluxo de entrada da mensagem
	      oisEntradaDados = new ObjectInputStream(
	         sCliente.getInputStream() );

	      jtaSaidaTexto.append( "\n[Adiquirido fluxos I/O]\n" );
	   }

	   // metodo de conexão ao servidor
	   private void conectarServidor() throws IOException
	   {      
	      jtaSaidaTexto.setText( "[Esperando por conexão...]\n" );

	      // cria o Socket para conectar se ao servidor
	      sCliente = new Socket( 
	         InetAddress.getByName( vServidor ), 5000 );

	      // exibe as informações de conexão
	      jtaSaidaTexto.append( "Conectado a: [ " +
	         sCliente.getInetAddress().getHostName() + " ]" );
	   }

	   // processa a conexão com o servidor
	   private void processaConexao() throws IOException
	   {
	      // habilita o jtfEntradaTexto para o cliente enviar menagem para o servidor
	      jtfEntradaTexto.setEnabled( true );

	      // processa a mensagem eviada pelo servidor
	      do {

	         // le a mensagem e a exibe no JTextArea
	         try {
	            vMensagem = ( String ) oisEntradaDados.readObject();//ler os dados do canal de comunicação
	            jtaSaidaTexto.append("\n[Cliente] <--< ["+ vMensagem+"]" );
	            jtaSaidaTexto.setCaretPosition( jtaSaidaTexto.getText().length() );
	         }

	         // processa problemas no recebimento da mensagem
	         catch ( ClassNotFoundException classNotFoundException ) {
	            jtaSaidaTexto.append( "\n[!]Problemas ao receber a mensagem" );
	         }
			//enquanto mensagem diferente de sair continua conectado
	      } while ( !vMensagem.equals( "sair" ) );

	   } 

	   // metodo responsavel por encerra a conexão
	   private void encerrarConexao() throws IOException
	   {
	      jtaSaidaTexto.append( "\n[!]Encerrada a Conexão" );
	      oosSaidaDados.close();
	      oisEntradaDados.close();
	      sCliente.close();
	      System.exit(0);
	   }

	   // envia a mensagem para o servidor
	   private void enviaMensagem( String pMessage )
	   {
	      // envia a mensagem ao servidor
	      try {
	         oosSaidaDados.writeObject(  pMessage );//grava a mensagem no canal de comunicação
	         oosSaidaDados.flush();//envia o fluxo para o outro lado
	         jtaSaidaTexto.append( "\n[Cliente] >--> [" + pMessage + "]" );
	      }

	      // processa problemas de envio de mensagem
	      catch ( IOException ioException ) {
	         jtaSaidaTexto.append( "\n[!]Erro ao enviar a mensagem" );
	      }
	   }

	   // executa aplicação
	   public static void main( String args[] )
	   {
	      Cliente obj;//instancia um objeto da classe cliente

	      if ( args.length == 0 )
	         obj = new Cliente( "127.0.0.1" );//cria o objeto e passa como parametro o ip do servidor
	      else
	         obj = new Cliente( args[ 0 ] );
	      
	      obj.setDefaultCloseOperation(
	         JFrame.EXIT_ON_CLOSE );


	      obj.runCliente();

	   }

	} // fim classe Cliente
