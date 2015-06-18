// Date: 05.06.2015 01:13:04
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.roller.roller.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import com.roller.roller.tileEntity.EntitySubTrain;

public class ModelSubTrain extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer bank;
    ModelRenderer Shape21;
    ModelRenderer Shape231;
    ModelRenderer Shape232;
    public ModelRenderer body;
    public ModelRenderer leg2;
    public ModelRenderer leg1;
    public ModelRenderer arm2;
    public ModelRenderer arm1;
    public ModelRenderer head;
    EntitySubTrain train;
  
  public ModelSubTrain(EntitySubTrain train)
  {
	  this.train = train;
    textureWidth = 128;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 23);
      Shape1.addBox(-9F, 0F, -6F, 18, 1, 12);
      Shape1.setRotationPoint(0F, 23F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, -6F, 1, 6, 17);
      Shape2.setRotationPoint(2F, 17F, -6F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, -1.570796F, 0F);
      bank = new ModelRenderer(this, 36, 0);
      bank.addBox(0F, 0F, -6F, 3, 1, 10);
      bank.setRotationPoint(-2F, 21F, 1F);
      bank.setTextureSize(64, 32);
      bank.mirror = true;
      setRotation(bank, 0F, 0F, 0F);
      Shape21 = new ModelRenderer(this, 0, 0);
      Shape21.addBox(0F, 0F, -6F, 1, 6, 17);
      Shape21.setRotationPoint(-3F, 17F, 6F);
      Shape21.setTextureSize(64, 32);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 1.570796F, 0F);
      Shape231 = new ModelRenderer(this, 62, 0);
      Shape231.addBox(0F, 0F, -6F, 1, 7, 12);
      Shape231.setRotationPoint(8F, 16F, 0F);
      Shape231.setTextureSize(64, 32);
      Shape231.mirror = true;
      setRotation(Shape231, 0F, 0F, 0F);
      Shape232 = new ModelRenderer(this, 62, 0);
      Shape232.addBox(0F, 0F, -6F, 1, 7, 12);
      Shape232.setRotationPoint(-9F, 16F, 0F);
      Shape232.setTextureSize(64, 32);
      Shape232.mirror = true;
      setRotation(Shape232, 0F, 0F, 0F);
      body = new ModelRenderer(this, 0, 36);
      body.addBox(-1.5F, -10F, -3F, 3, 10, 6);
      body.setRotationPoint(-0.5F, 18F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 18, 36);
      leg2.addBox(0F, -1.1F, 0F, 3, 9, 3);
      leg2.setRotationPoint(-0.5F, 18F, 0F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, -0.0371786F, 0.2268928F, 1.375609F);
      leg1 = new ModelRenderer(this, 18, 36);
      leg1.addBox(0F, -1.133333F, -2.966667F, 3, 9, 3);
      leg1.setRotationPoint(-0.5F, 18F, 0F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, -0.0371786F, -0.2268928F, 1.375609F);
      arm2 = new ModelRenderer(this, 30, 36);
      arm2.addBox(-1.5F, 0F, 3F, 3, 10, 3);
      arm2.setRotationPoint(-0.5F, 8F, 0F);
      arm2.setTextureSize(64, 32);
      arm2.mirror = true;
      setRotation(arm2, 0F, 0F, 0.4833219F);
      arm1 = new ModelRenderer(this, 30, 36);
      arm1.addBox(-1.5F, 0F, -6F, 3, 10, 3);
      arm1.setRotationPoint(-0.5F, 8F, 0F);
      arm1.setTextureSize(64, 32);
      arm1.mirror = true;
      setRotation(arm1, 0F, 0F, 0.4833219F);
      head = new ModelRenderer(this, 42, 36);
      head.addBox(-3F, -6F, -3F, 6, 6, 6);
      head.setRotationPoint(-0.5F, 8F, 0F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    GL11.glBlendFunc( GL11.GL_DST_COLOR, GL11.GL_ONE );
    float r = ((float)train.red/32), g = ((float)train.green/32), b = ((float)train.blue/32);
    GL11.glColor3f(r, g, b);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    bank.render(f5);
    Shape21.render(f5);
    Shape231.render(f5);
    Shape232.render(f5);
    GL11.glColor3f(1, 1, 1);
    body.render(f5);
    leg2.render(f5);
    leg1.render(f5);
    arm2.render(f5);
    arm1.render(f5);
    head.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
  }

}