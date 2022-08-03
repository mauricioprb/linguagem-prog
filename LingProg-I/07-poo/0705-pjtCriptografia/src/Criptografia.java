public class Criptografia {
    
    private char[] alfabeto = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 
        'w', 'x', 'y', 'z', '@', '#', '$', '%', '*', '*', '+', '&'};
    
    public Criptografia(){
        // Pode ser utilizado para carregar um arquivo com alfabeto
    }
    public String criptografar(String mensagemOriginal, int chave) {
        String mensagemCriptografada="";
        for (int i=0; i < mensagemOriginal.length(); i++) {
            for (int j=0; j < alfabeto.length; j++) {
                if (mensagemOriginal.charAt(i) == alfabeto[j]) {
                    mensagemCriptografada = mensagemCriptografada + alfabeto[j + chave];
                }
            }
        }
        return mensagemCriptografada;
    }
    
    public String descriptografar(String mensagemCriptografada, int chave) {
        String mensagemOriginal="";
        for (int i=0; i < mensagemCriptografada.length(); i++) {
            for (int j=0; j < alfabeto.length; j++) {
                if (mensagemCriptografada.charAt(i) == alfabeto[j]) {
                    mensagemOriginal = mensagemOriginal + alfabeto[j - chave];
                }
            }
        }
        return mensagemOriginal;
    }  
}