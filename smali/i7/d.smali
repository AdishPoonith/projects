.class public final Li7/d;
.super Li7/f;
.source "SourceFile"


# static fields
.field private static final l:Li7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li7/d;

    invoke-direct {v0}, Li7/d;-><init>()V

    sput-object v0, Li7/d;->l:Li7/d;

    sget-object v1, Li7/f;->k:[Ljava/lang/StackTraceElement;

    invoke-virtual {v0, v1}, Ljava/lang/Exception;->setStackTrace([Ljava/lang/StackTraceElement;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li7/f;-><init>()V

    return-void
.end method

.method public static a()Li7/d;
    .locals 1

    sget-boolean v0, Li7/f;->j:Z

    if-eqz v0, :cond_0

    new-instance v0, Li7/d;

    invoke-direct {v0}, Li7/d;-><init>()V

    return-object v0

    :cond_0
    sget-object v0, Li7/d;->l:Li7/d;

    return-object v0
.end method
