package exer1;
class RodarAplicacao {

    public static void main(String[] args) {
        
        Carro carro1 = new Carro();

        carro1.setCor("Preto");
        carro1.setModelo("Corsa Hatch");
        carro1.setAno(2006);
        carro1.setCapacidadeTanque(60);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getAno());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2 = new Carro("Prata", "Renault Clio", 2011, 55);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getAno());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.39));
    }
}
