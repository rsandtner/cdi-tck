package org.jboss.jsr299.tck.tests.extensions.annotated;

class Milk
{
   @SuppressWarnings("unused")
   private boolean fresh;

   public Milk(boolean fresh)
   {
      this.fresh = fresh;
   }
}