.class public Li9/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/r$c;,
        Li9/r$a;,
        Li9/r$b;
    }
.end annotation


# static fields
.field static final c:Ljava/util/logging/Logger;

.field public static final d:Li9/r;


# instance fields
.field final a:Li9/e1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/e1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Li9/r;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Li9/r;->c:Ljava/util/logging/Logger;

    new-instance v0, Li9/r;

    invoke-direct {v0}, Li9/r;-><init>()V

    sput-object v0, Li9/r;->d:Li9/r;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Li9/r;->a:Li9/e1;

    const/4 v0, 0x0

    iput v0, p0, Li9/r;->b:I

    invoke-static {v0}, Li9/r;->k(I)V

    return-void
.end method

.method static d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e()Li9/r;
    .locals 1

    invoke-static {}, Li9/r;->j()Li9/r$c;

    move-result-object v0

    invoke-virtual {v0}, Li9/r$c;->b()Li9/r;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Li9/r;->d:Li9/r;

    :cond_0
    return-object v0
.end method

.method static j()Li9/r$c;
    .locals 1

    sget-object v0, Li9/r$b;->a:Li9/r$c;

    return-object v0
.end method

.method private static k(I)V
    .locals 3

    const/16 v0, 0x3e8

    if-ne p0, v0, :cond_0

    sget-object p0, Li9/r;->c:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    const-string v2, "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000"

    invoke-virtual {p0, v0, v2, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Li9/r$a;Ljava/util/concurrent/Executor;)V
    .locals 1

    const-string v0, "cancellationListener"

    invoke-static {p1, v0}, Li9/r;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "executor"

    invoke-static {p2, p1}, Li9/r;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public b()Li9/r;
    .locals 1

    invoke-static {}, Li9/r;->j()Li9/r$c;

    move-result-object v0

    invoke-virtual {v0, p0}, Li9/r$c;->d(Li9/r;)Li9/r;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Li9/r;->d:Li9/r;

    :cond_0
    return-object v0
.end method

.method public c()Ljava/lang/Throwable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f(Li9/r;)V
    .locals 1

    const-string v0, "toAttach"

    invoke-static {p1, v0}, Li9/r;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Li9/r;->j()Li9/r$c;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Li9/r$c;->c(Li9/r;Li9/r;)V

    return-void
.end method

.method public g()Li9/t;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public i(Li9/r$a;)V
    .locals 0

    return-void
.end method
