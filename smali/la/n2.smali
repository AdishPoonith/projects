.class final Lla/n2;
.super Lla/b2;
.source "SourceFile"


# instance fields
.field private final n:Lv9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/d<",
            "Ls9/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv9/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lla/b2;-><init>()V

    iput-object p1, p0, Lla/n2;->n:Lv9/d;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lla/n2;->n:Lv9/d;

    sget-object v0, Ls9/n;->k:Ls9/n$a;

    sget-object v0, Ls9/u;->a:Ls9/u;

    invoke-static {v0}, Ls9/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Lv9/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lla/n2;->A(Ljava/lang/Throwable;)V

    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
