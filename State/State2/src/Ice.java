public class Ice {

    private IceState iceState = new Solid();

    public void freeze(){
        iceState.freezeButton();
    }
    public void hot(){
        iceState.hotButton();
    }
    public void vapor(){
        iceState.vaporButton();
    }

    private interface IceState{
        void freezeButton();
        void hotButton();
        void vaporButton();
    }
    private final class Solid implements IceState{
        @Override
        public void hotButton() {
            System.out.println("the ice melted!");
            iceState = new Liquid();
        }

        @Override
        public void freezeButton() {

        }

        @Override
        public void vaporButton() {
            System.out.println("The ice sublimated!");
            iceState = new Gaz();
        }
    }
    private final class Liquid implements IceState{
        @Override
        public void hotButton() {

        }

        @Override
        public void freezeButton() {
            System.out.println("The ice solidified!");
            iceState = new Solid();
        }

        @Override
        public void vaporButton() {
            System.out.println("The ice evaporated!");
            iceState = new Gaz();
        }
    }
    private final class Gaz implements IceState{
        @Override
        public void hotButton() {
            System.out.println("The ice condensed!");
            iceState = new Liquid();
        }

        @Override
        public void freezeButton() {
            System.out.println("The ice desublimated!");
            iceState = new Solid();
        }

        @Override
        public void vaporButton() {

        }
    }
}
