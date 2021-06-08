package ex02Aviao;

public class MostraAviao {

	public static void main(String[] args) {
		Aviao aeronave = new Aviao();
		
		aeronave.setModelo("Boeing");
		aeronave.setCiaAerea("LATAM");
		aeronave.setCombustivel(2000);
		aeronave.setVelocidade(300);
		aeronave.setTempoNoAr(4);
		aeronave.setNumPassageiros(150);
		
		double kmPercorridos = aeronave.voar();
		
		System.out.println("Informa��es da aeronave em quest�o:");
		System.out.println("Modelo: " + aeronave.getModelo());
		System.out.println("Cia A�rea: " + aeronave.getCiaAerea());
		System.out.println("Capacidade de combust�vel: " + aeronave.getCombustivel() + "L");
		System.out.println("N�mero de passageiros: " +aeronave.getNumPassageiros());
		System.out.println("Quil�metros percorridos baseado na velocidade (km/h) e no tempo no ar (h): " + kmPercorridos + " km");

	}

}
