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
		
		System.out.println("Informações da aeronave em questão:");
		System.out.println("Modelo: " + aeronave.getModelo());
		System.out.println("Cia Aérea: " + aeronave.getCiaAerea());
		System.out.println("Capacidade de combustível: " + aeronave.getCombustivel() + "L");
		System.out.println("Número de passageiros: " +aeronave.getNumPassageiros());
		System.out.println("Quilômetros percorridos baseado na velocidade (km/h) e no tempo no ar (h): " + kmPercorridos + " km");

	}

}
