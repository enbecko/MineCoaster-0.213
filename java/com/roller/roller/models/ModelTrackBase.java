// Date: 23.07.2014 23:10:34
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.roller.roller.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTrackBase extends ModelBase
{
  //fields
    ModelRenderer aussen12;
    ModelRenderer aussen2;
    ModelRenderer mitte;
    ModelRenderer Shape3;
    ModelRenderer Shape31;
    ModelRenderer Shape32;
    ModelRenderer Shape33;
  
  public ModelTrackBase()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      aussen12 = new ModelRenderer(this, 0, 0);
      aussen12.addBox(0F, 0F, 0F, 2, 2, 16);
      aussen12.setRotationPoint(5F, 22F, -8F);
      aussen12.setTextureSize(128, 64);
      aussen12.mirror = true;
      setRotation(aussen12, 0F, 0F, 0F);
      aussen2 = new ModelRenderer(this, 0, 0);
      aussen2.addBox(0F, 0F, 0F, 2, 2, 16);
      aussen2.setRotationPoint(-7F, 22F, -8F);
      aussen2.setTextureSize(128, 64);
      aussen2.mirror = true;
      setRotation(aussen2, 0F, 0F, 0F);
      mitte = new ModelRenderer(this, 0, 19);
      mitte.addBox(0F, 0F, 0F, 4, 1, 16);
      mitte.setRotationPoint(-2F, 23F, -8F);
      mitte.setTextureSize(128, 64);
      mitte.mirror = true;
      setRotation(mitte, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 38, 0);
      Shape3.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape3.setRotationPoint(-5.533333F, 22F, 3.3F);
      Shape3.setTextureSize(128, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0.2406285F);
      Shape31 = new ModelRenderer(this, 38, 0);
      Shape31.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape31.setRotationPoint(1.6F, 23F, -5F);
      Shape31.setTextureSize(128, 64);
      Shape31.mirror = true;
      setRotation(Shape31, 0F, 0F, -0.2406351F);
      Shape32 = new ModelRenderer(this, 38, 0);
      Shape32.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape32.setRotationPoint(1.6F, 23F, 3.333333F);
      Shape32.setTextureSize(128, 64);
      Shape32.mirror = true;
      setRotation(Shape32, 0F, 0F, -0.2406351F);
      Shape33 = new ModelRenderer(this, 38, 0);
      Shape33.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape33.setRotationPoint(-5.533333F, 22F, -5F);
      Shape33.setTextureSize(128, 64);
      Shape33.mirror = true;
      setRotation(Shape33, 0F, 0F, 0.2406285F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    aussen12.render(f5);
    aussen2.render(f5);
    mitte.render(f5);
    Shape3.render(f5);
    Shape31.render(f5);
    Shape32.render(f5);
    Shape33.render(f5);
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
