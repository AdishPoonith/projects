.class public final Lla/q;
.super Lla/x1;
.source "SourceFile"


# instance fields
.field public final n:Lla/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lla/m<",
            "*>;"
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
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lla/x1;-><init>()V

    iput-object p1, p0, Lla/q;->n:Lla/m;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lla/q;->n:Lla/m;

    invoke-virtual {p0}, Lla/b2;->B()Lla/c2;

    move-result-object v0

    invoke-virtual {p1, v0}, Lla/m;->v(Lla/v1;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lla/m;->G(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/q;->A(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
