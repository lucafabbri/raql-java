// Generated from /Users/rchdeveloper/Documents/GitHub/raql-java/RAQL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RAQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RAQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RAQLParser#raql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaql(RAQLParser.RaqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClause(RAQLParser.ClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#conjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunction(RAQLParser.ConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(RAQLParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#string_array_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_array_operation(RAQLParser.String_array_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#number_array_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_array_operation(RAQLParser.Number_array_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#bool_array_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_array_operation(RAQLParser.Bool_array_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#array_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_operator(RAQLParser.Array_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#string_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_operation(RAQLParser.String_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#string_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_operator(RAQLParser.String_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#number_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_operation(RAQLParser.Number_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#number_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_operator(RAQLParser.Number_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#bool_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_operation(RAQLParser.Bool_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#bool_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_operator(RAQLParser.Bool_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(RAQLParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#nullstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullstring(RAQLParser.NullstringContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(RAQLParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#string_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_array(RAQLParser.String_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(RAQLParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#number_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_array(RAQLParser.Number_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(RAQLParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link RAQLParser#bool_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_array(RAQLParser.Bool_arrayContext ctx);
}