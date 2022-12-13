package tienda.productos;

public class AlimentoHumedo extends Producto {

        //Attribute
        private String categoria;


        //Constructor
        public AlimentoHumedo() { }
        public AlimentoHumedo(String nombre, double precioUnit, int cantStock, boolean disponible, String categoria) {
            super(nombre, precioUnit, cantStock, disponible);
            this.categoria = categoria;
        }


        //Methods
        @Override
        public String toString() {
            return  "  *PRODUCTO: ALIMENTO HUMEDO: "+
                    super.toString()+
                    " Categoria: "  +this.categoria;
        }

        //Gets and Sets
        public String getCategoria() {
            return categoria;
        }
        public void setDirector(String categoria) {
            this.categoria = categoria;
        }
    }


