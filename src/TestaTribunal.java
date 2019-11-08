
public class TestaTribunal {
    
    public static void main(String[] args){
        Servidor boss = new Servidor("Monica");
        
        AssistenteAdm a1 = new AssistenteAdm("Joey", "Compras");
        
        AnalistaTI t1 = new AnalistaTI("Rachel", boss, "X-01");
        
        AnalistaJuridico j1 = new AnalistaJuridico("Lucas", boss, "Criminal");
        
        AnalistaAdHoc h1 = new AnalistaAdHoc("Phoebe", boss, 10);
        
    }
    
}
