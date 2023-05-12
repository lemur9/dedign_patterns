package review.structuralPatterns.decorator;

// 创建一个接口 Shape
interface Shape {
   void draw();
}

// 创建具体的形状类
class Rectangle implements Shape {
   @Override
   public void draw() {
      System.out.println("形状: 矩形");
   }
}

// 创建装饰器类
abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape) {
      this.decoratedShape = decoratedShape;
   }

   public void draw() {
      decoratedShape.draw();
   }
}

// 创建具体的装饰器类
class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);
   }

   @Override
   public void draw() {
      decoratedShape.draw();
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape) {
      System.out.println("边框颜色：红色");
   }
}

// 使用包装器模式
public class WrapperPatternDemo {
   public static void main(String[] args) {

      Shape rectangle = new Rectangle();

      // 使用装饰器包装具体形状对象
      Shape redRectangle = new RedShapeDecorator(new Rectangle());

      System.out.println("普通矩形：");
      rectangle.draw();

      System.out.println("\n红色边框的矩形：");
      redRectangle.draw();
   }
}
