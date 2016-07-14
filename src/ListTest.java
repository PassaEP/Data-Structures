class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GeneralList l = new GeneralList(); 
        for (int i = 0; i < 10; i++){
            l.insert(i*5,i);
	    l.show(); 
	}
    }
    
}

