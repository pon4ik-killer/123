package expensive.util.visual.shader.main.shaders;

import expensive.util.visual.shader.main.IShader;

public class VertexGlsl implements IShader {


    @Override
    public String glsl() {
        return """
                #version 120 
                 void main() {
                     // Выборка данных из текстуры во фрагментном шейдере (координаты)
                     gl_TexCoord[0] = gl_MultiTexCoord0;
                     gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;
                 }
                 """;
    }
}
