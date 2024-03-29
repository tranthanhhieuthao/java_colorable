
    public abstract class Shape {
        String color ="green";
        boolean filled = true;

        public Shape(){
        }

        public Shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }

        public String getColor(){
            return this.color;
        }

        public boolean getfilled(){
            return this.filled;
        }

        public void setColor(String color){
            this.color =color;
        }

        public void setFilled(boolean filled){
            this.filled = filled;
        }

        @Override

        public String toString(){
            return "A shape with color of"
                    +" "
                    + getColor()
                    +" "
                    +"anh"
                    +" "
                    +( getfilled() ? "filled" : "not filled");
        }
        public abstract double getArea();

    }
