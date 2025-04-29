.class final Loa/g;
.super Loa/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Loa/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final j:Lda/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lda/p<",
            "Loa/c<",
            "-TT;>;",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lda/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lda/p<",
            "-",
            "Loa/c<",
            "-TT;>;-",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Loa/a;-><init>()V

    iput-object p1, p0, Loa/g;->j:Lda/p;

    return-void
.end method


# virtual methods
.method public b(Loa/c;Lv9/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loa/c<",
            "-TT;>;",
            "Lv9/d<",
            "-",
            "Ls9/u;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Loa/g;->j:Lda/p;

    invoke-interface {v0, p1, p2}, Lda/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lw9/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ls9/u;->a:Ls9/u;

    return-object p1
.end method
