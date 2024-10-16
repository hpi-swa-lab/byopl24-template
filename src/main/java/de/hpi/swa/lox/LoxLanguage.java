package de.hpi.swa.lox;

import de.hpi.swa.lox.parser.LoxBytecodeCompiler;

import com.oracle.truffle.api.instrumentation.StandardTags.StatementTag;
import com.oracle.truffle.api.source.Source;

import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.debug.DebuggerTags.AlwaysHalt;
import com.oracle.truffle.api.instrumentation.ProvidedTags;
import com.oracle.truffle.api.instrumentation.StandardTags.RootBodyTag;
import com.oracle.truffle.api.instrumentation.StandardTags.RootTag;
import com.oracle.truffle.api.strings.TruffleString;

import com.oracle.truffle.api.instrumentation.StandardTags.ExpressionTag;

import de.hpi.swa.lox.runtime.LoxContext;

@ProvidedTags({ RootTag.class, RootBodyTag.class, ExpressionTag.class, StatementTag.class, AlwaysHalt.class })
@TruffleLanguage.Registration(id = LoxLanguage.ID)
public class LoxLanguage extends TruffleLanguage<LoxContext> {

    public static final String ID = "lox";

    public static final TruffleString.Encoding STRING_ENCODING = TruffleString.Encoding.UTF_16;

    @Override
    protected LoxContext createContext(Env env) {
        return new LoxContext(this, env);
    }

    @Override
    protected CallTarget parse(ParsingRequest request) {
        Source source = request.getSource();
        RootCallTarget rootTarget = LoxBytecodeCompiler.parseLox(this, source);
        return rootTarget;
    }
}
