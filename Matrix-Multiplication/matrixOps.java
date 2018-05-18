public class MatrixOps {
    
    
    
    
    public static double[][] multiply(double[][] matrix1, double[][] matrix2){
        
        
        
           int aRows = matrix1.length;
            int aColumns = matrix1[0].length;
            int bRows = matrix2.length;
            int bColumns = matrix2[0].length;

            if (aColumns != bRows) {
                return null;
            }
            

            double[][] result = new double[aRows][bColumns];
            
            for (int i = 0; i < aRows; i++) { // aRow
                
                for (int j = 0; j < bColumns; j++) { // bColumn
                    
                    for (int k = 0; k < aColumns; k++) { // aColumn
                        
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                        
                    }
                }
            }

            
            return result;
        
        
    }//end of multiply
}//end of class

