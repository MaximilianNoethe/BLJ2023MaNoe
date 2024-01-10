public class Cat {

        private String name;
        private String breed;
        private String color;
        private int birthyear;
        private int height;

        public Cat(){}

        public Cat(String name){
            this.name = name;
        }

        public Cat(String name, String breed, String color, int birthyear, int height) {
            this.name = name;
            this.breed = breed;
            this.color = color;
            this.birthyear = birthyear;
            this.height = height;
        }

        void meowing(){
            System.out.println(name + "Meow!");
        }

        void sleeping(){
            System.out.println(name + "ZZzzzZZZzZ");
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getBirthyear() {
            return birthyear;
        }

        public void setBirthyear(int birthyear) {
            this.birthyear = birthyear;
        }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", birthyear=" + birthyear +
                ", height=" + height;
    }
}


