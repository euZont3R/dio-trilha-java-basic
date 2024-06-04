public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual ? " +smartTv.canal);

        System.out.println("---------------------------------------");
        
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        System.out.println("---------------------------------------");

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumenntarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("---------------------------------------");

        System.out.println("TV Ligada ? " +smartTv.ligada);
        System.out.println("Canal Atual ? " +smartTv.canal);
        System.out.println("Volume Atual ? " +smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada );
    
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada );
    }
}
