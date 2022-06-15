class Guest implements User {
    public static void main(String[] args) {
        Guest guest = new Guest();
        
        if(guest.isAuthorized("WeAreChampions")){
            System.out.println("Bem-vindo");
        }
        else{
            System.out.println("Tente de novo");
        }
    }
    @Override
    public boolean isAuthorized(String word){
        boolean status = false;
        if(word.equals("WeAreChampions")){
            status = true;
        }
        return status;
    }
}