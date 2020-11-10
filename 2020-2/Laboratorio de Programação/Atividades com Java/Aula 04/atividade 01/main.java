class Main {
    public static void main(String[] args) {
          int[] data = {3,5,5,5,5,5,5, 4, 1, 5};    
          String exibe = "{"; 
  
          for (int i=0; i<data.length; i++){
              if(i==data.length - 1)
                  exibe+=Integer.toString(data[i]) + "}";
              else
                  exibe+=Integer.toString(data[i]) + ", ";
          }
            System.out.println(" os valores armazenados são: " + exibe);
        }
  }