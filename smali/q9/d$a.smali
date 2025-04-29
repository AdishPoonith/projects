.class Lq9/d$a;
.super Li9/r0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq9/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lq9/d;


# direct methods
.method constructor <init>(Lq9/d;)V
    .locals 0

    iput-object p1, p0, Lq9/d$a;->c:Lq9/d;

    invoke-direct {p0}, Li9/r0;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Li9/j1;)V
    .locals 3

    iget-object v0, p0, Lq9/d$a;->c:Lq9/d;

    invoke-static {v0}, Lq9/d;->h(Lq9/d;)Li9/r0$d;

    move-result-object v0

    sget-object v1, Li9/p;->l:Li9/p;

    new-instance v2, Lq9/d$a$a;

    invoke-direct {v2, p0, p1}, Lq9/d$a$a;-><init>(Lq9/d$a;Li9/j1;)V

    invoke-virtual {v0, v1, v2}, Li9/r0$d;->f(Li9/p;Li9/r0$i;)V

    return-void
.end method

.method public d(Li9/r0$g;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "GracefulSwitchLoadBalancer must switch to a load balancing policy before handling ResolvedAddresses"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f()V
    .locals 0

    return-void
.end method
