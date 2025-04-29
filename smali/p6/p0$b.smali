.class Lp6/p0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp6/z0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/p0;-><init>(Lp6/p0$c;Ll6/i0;Lp6/o;Lq6/g;Lp6/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lp6/p0;


# direct methods
.method constructor <init>(Lp6/p0;)V
    .locals 0

    iput-object p1, p0, Lp6/p0$b;->a:Lp6/p0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Li9/j1;)V
    .locals 1

    iget-object v0, p0, Lp6/p0$b;->a:Lp6/p0;

    invoke-static {v0, p1}, Lp6/p0;->k(Lp6/p0;Li9/j1;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lp6/p0$b;->a:Lp6/p0;

    invoke-static {v0}, Lp6/p0;->h(Lp6/p0;)Lp6/z0;

    move-result-object v0

    invoke-virtual {v0}, Lp6/z0;->C()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lp6/p0$b;->a:Lp6/p0;

    invoke-static {v0}, Lp6/p0;->i(Lp6/p0;)V

    return-void
.end method

.method public e(Lm6/w;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm6/w;",
            "Ljava/util/List<",
            "Ln6/i;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lp6/p0$b;->a:Lp6/p0;

    invoke-static {v0, p1, p2}, Lp6/p0;->j(Lp6/p0;Lm6/w;Ljava/util/List;)V

    return-void
.end method
