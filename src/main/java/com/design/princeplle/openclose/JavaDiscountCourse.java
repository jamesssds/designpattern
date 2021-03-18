package com.design.princeplle.openclose;

/**
 * 新增的业务，尽量不修改ICourse接口
 */
public class JavaDiscountCourse extends JavaCource {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
    public Double getOriginPrice(){
        return super.getPrice();

    }
}
