// Date: 25.05.2015 18:32:48
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.roller.roller.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import com.roller.roller.tileEntity.EntityTrain;

public class ModelTrain2 extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape24;
    ModelRenderer Shape26;
    ModelRenderer Shape27;
    ModelRenderer Shape28;
    ModelRenderer Shape29;
    ModelRenderer Shape211;
    EntityTrain train;
  
  public ModelTrain2(EntityTrain train)
  {
    textureWidth = 128;
    textureHeight = 64;
    this.train = train;
    
      Shape1 = new ModelRenderer(this, 0, 22);
      Shape1.addBox(-9F, 0F, -6F, 17, 1, 12);
      Shape1.setRotationPoint(2F, 23F, 0F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 28, 0);
      Shape2.addBox(0F, 0F, -6F, 1, 6, 16);
      Shape2.setRotationPoint(4F, 17F, -6F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, -1.570796F, 0F);
      Shape21 = new ModelRenderer(this, 58, 20);
      Shape21.addBox(0F, 0F, -4F, 1, 7, 8);
      Shape21.setRotationPoint(-10F, 17F, 0F);
      Shape21.setTextureSize(64, 32);
      Shape21.mirror = true;
      setRotation(Shape21, 0F, 0F, 0F);
      Shape22 = new ModelRenderer(this, 28, 35);
      Shape22.addBox(0F, 0F, -5F, 2, 8, 10);
      Shape22.setRotationPoint(-9F, 16F, 0F);
      Shape22.setTextureSize(64, 32);
      Shape22.mirror = true;
      setRotation(Shape22, 0F, 0F, 0F);
      Shape23 = new ModelRenderer(this, 62, 0);
      Shape23.addBox(0F, 0F, -6F, 1, 7, 12);
      Shape23.setRotationPoint(9F, 16F, 0F);
      Shape23.setTextureSize(64, 32);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0F);
      Shape24 = new ModelRenderer(this, 0, 0);
      Shape24.addBox(0F, 0F, -2F, 1, 2, 2);
      Shape24.setRotationPoint(-6F, 15F, 5F);
      Shape24.setTextureSize(64, 32);
      Shape24.mirror = true;
      setRotation(Shape24, 0F, -1.570796F, 0F);
      Shape26 = new ModelRenderer(this, 0, 0);
      Shape26.addBox(0F, 0F, -2F, 1, 2, 2);
      Shape26.setRotationPoint(-4F, 15F, -5F);
      Shape26.setTextureSize(64, 32);
      Shape26.mirror = true;
      setRotation(Shape26, 0F, 1.570796F, 0F);
      Shape27 = new ModelRenderer(this, 19, 0);
      Shape27.addBox(-1F, 0F, -5F, 1, 1, 10);
      Shape27.setRotationPoint(-2.5F, 17F, 0F);
      Shape27.setTextureSize(64, 32);
      Shape27.mirror = true;
      setRotation(Shape27, 0F, 0F, 0F);
      Shape28 = new ModelRenderer(this, 0, 0);
      Shape28.addBox(0F, 0F, -6F, 1, 9, 12);
      Shape28.setRotationPoint(-7F, 14F, 0F);
      Shape28.setTextureSize(64, 32);
      Shape28.mirror = true;
      setRotation(Shape28, 0F, 0F, 0F);
      Shape29 = new ModelRenderer(this, 0, 35);
      Shape29.addBox(-1F, 0F, -5F, 4, 2, 10);
      Shape29.setRotationPoint(0F, 20F, 0F);
      Shape29.setTextureSize(64, 32);
      Shape29.mirror = true;
      setRotation(Shape29, 0F, 0F, 0F);
      Shape211 = new ModelRenderer(this, 28, 0);
      Shape211.addBox(0F, 0F, -6F, 1, 6, 16);
      Shape211.setRotationPoint(0F, 17F, 6F);
      Shape211.setTextureSize(64, 32);
      Shape211.mirror = true;
      setRotation(Shape211, 0F, 1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    GL11.glBlendFunc( GL11.GL_DST_COLOR, GL11.GL_ONE );
    float r = ((float)train.red/32), g = ((float)train.green/32), b = ((float)train.blue/32);
    GL11.glColor3f(r, g, b);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape21.render(f5);
    Shape22.render(f5);
    Shape23.render(f5);
    Shape24.render(f5);
    Shape26.render(f5);
    Shape27.render(f5);
    Shape28.render(f5);
    Shape29.render(f5);
    Shape211.render(f5);
    GL11.glColor3f(1, 1, 1);

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
