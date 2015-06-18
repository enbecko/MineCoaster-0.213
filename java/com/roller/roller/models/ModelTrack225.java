// Date: 06.04.2015 16:21:25
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.roller.roller.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrack225 extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape2;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
  
  public ModelTrack225()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 40, 0);
      Shape1.addBox(-1F, 0F, 0F, 4, 1, 18);
      Shape1.setRotationPoint(-1F, 22.8F, -8.3F);
      Shape1.setTextureSize(128, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0.447331F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 0, 0);
      Shape11.addBox(-1F, 0F, 0F, 2, 2, 18);
      Shape11.setRotationPoint(-6F, 22F, -8.5F);
      Shape11.setTextureSize(128, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0.447331F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 0, 0);
      Shape12.addBox(-1F, 0F, 0F, 2, 2, 18);
      Shape12.setRotationPoint(6F, 22F, -8.5F);
      Shape12.setTextureSize(128, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0.447331F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, -8F, 4, 1, 1);
      Shape2.setRotationPoint(-5.3F, 17.2F, 2.8F);
      Shape2.setTextureSize(128, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0.4363323F, 0F, 0.1487195F);
      Shape21 = new ModelRenderer(this, 0, 0);
      Shape21.addBox(0F, 0F, -8F, 4, 1, 1);
      Shape21.setRotationPoint(1.3F, 17.7F, 3F);
      Shape21.setTextureSize(128, 32);
      Shape21.mirror = true;
      setRotation(Shape21, 0.4363323F, 0F, -0.1487144F);
      Shape22 = new ModelRenderer(this, 0, 0);
      Shape22.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape22.setRotationPoint(1.5F, 17.5F, 3F);
      Shape22.setTextureSize(128, 32);
      Shape22.mirror = true;
      setRotation(Shape22, 0.4363323F, 0F, -0.1487144F);
      Shape23 = new ModelRenderer(this, 0, 0);
      Shape23.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape23.setRotationPoint(-5.5F, 17F, 2.8F);
      Shape23.setTextureSize(128, 32);
      Shape23.mirror = true;
      setRotation(Shape23, 0.4363323F, 0F, 0.1487195F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape2.render(f5);
    Shape21.render(f5);
    Shape22.render(f5);
    Shape23.render(f5);
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