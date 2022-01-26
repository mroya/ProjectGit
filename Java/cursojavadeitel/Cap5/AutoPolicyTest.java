// Figura 5.12: AutoPolicyTest.java
// Demonstrando Strings em um switch
package cursojavadeitel.Cap5;

public class AutoPolicyTest {

	public static void main(String[] args) {
		// Cria dois objetos AutoPolicy
		AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
		
		// exibe se cada apólice está em um estado "sem CUlpa"
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);
	}
	
	// Método que mostra se um AutoPolicy
	// está em um estado co seguro de automóvel "Sem culpa"
	public static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", 
				policy.getAccoutNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
	}
} // fim da classe AutoPolicyTest
