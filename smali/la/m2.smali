.class final Lla/m2;
.super Lla/b2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/b2;"
    }
.end annotation


# instance fields
.field private final n:Lla/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lla/m<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lla/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lla/m<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lla/b2;-><init>()V

    iput-object p1, p0, Lla/m2;->n:Lla/m;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 2

    invoke-virtual {p0}, Lla/b2;->B()Lla/c2;

    move-result-object p1

    invoke-virtual {p1}, Lla/c2;->i0()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lla/z;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lla/m2;->n:Lla/m;

    sget-object v1, Ls9/n;->k:Ls9/n$a;

    check-cast p1, Lla/z;

    iget-object p1, p1, Lla/z;->a:Ljava/lang/Throwable;

    invoke-static {p1}, Ls9/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lla/m2;->n:Lla/m;

    sget-object v1, Ls9/n;->k:Ls9/n$a;

    invoke-static {p1}, Lla/d2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Ls9/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lv9/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/m2;->A(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
