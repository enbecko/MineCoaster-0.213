// Date: 24.07.2014 17:13:31
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.roller.roller.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrackSide extends ModelBase
{
  //fields
    ModelRenderer aussne;
    ModelRenderer aussen1;
    ModelRenderer midde;
    ModelRenderer Shape5;
    ModelRenderer Shape51;
    ModelRenderer Shape52;
    ModelRenderer Shape53;
  
  public ModelTrackSide()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      aussne = new ModelRenderer(this, 0, 0);
      aussne.addBox(0F, 0F, 0F, 2, 2, 16);
      aussne.setRotationPoint(1F, 22F, -8F);
      aussne.setTextureSize(128, 64);
      aussne.mirror = true;
      setRotation(aussne, 0F, 0F, 0.93666F);
      aussen1 = new ModelRenderer(this, 0, 0);
      aussen1.addBox(0F, 0F, 0F, 2, 2, 16);
      aussen1.setRotationPoint(-6F, 8F, -8F);
      aussen1.setTextureSize(128, 64);
      aussen1.mirror = true;
      setRotation(aussen1, 0F, 0F, 0.9797115F);
      midde = new ModelRenderer(this, 37, 0);
      midde.addBox(0F, 0F, 0F, 1, 4, 16);
      midde.setRotationPoint(-4.8F, 15F, -8F);
      midde.setTextureSize(128, 64);
      midde.mirror = true;
      setRotation(midde, 0F, 0F, -0.5061455F);
      Shape5 = new ModelRenderer(this, 0, 20);
      Shape5.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape5.setRotationPoint(-3.3F, 18.4F, -4.8F);
      Shape5.setTextureSize(128, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, -0.6294821F);
      Shape51 = new ModelRenderer(this, 0, 20);
      Shape51.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape51.setRotationPoint(-3.266667F, 18.4F, 3.666667F);
      Shape51.setTextureSize(128, 64);
      Shape51.mirror = true;
      setRotation(Shape51, 0F, 0F, -0.6294821F);
      Shape52 = new ModelRenderer(this, 0, 20);
      Shape52.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape52.setRotationPoint(-6.333333F, 9.533334F, -4.8F);
      Shape52.setTextureSize(128, 64);
      Shape52.mirror = true;
      setRotation(Shape52, 0F, 0F, -0.2629629F);
      Shape53 = new ModelRenderer(this, 0, 20);
      Shape53.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape53.setRotationPoint(-6.333333F, 9.533334F, 3.666667F);
      Shape53.setTextureSize(128, 64);
      Shape53.mirror = true;
      setRotation(Shape53, 0F, 0F, -0.2629629F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    aussne.render(f5);
    aussen1.render(f5);
    midde.render(f5);
    Shape5.render(f5);
    Shape51.render(f5);
    Shape52.render(f5);
    Shape53.render(f5);
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
