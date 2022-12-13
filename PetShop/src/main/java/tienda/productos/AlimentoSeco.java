package tienda.productos;

public class AlimentoSeco extends Producto {


        //Attribute
        private String categoria;


        //Constructor
        public AlimentoSeco() { }
        public AlimentoSeco(String nombre, double precioUnit, int cantStock, boolean disponible, String categoria) {
            super(nombre, precioUnit, cantStock, disponible);
            this.categoria = categoria;
        }


        //Methods
        @Override
        public String toString() {
            return  "  *PRODUCTO: ALIMENTO SECO; "+
                    super.toString()+
                    " Categoria: "  +this.categoria;
        }

        //Gets and Sets
        public String getCategoria() {
            return categoria;
        }
        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }






}
