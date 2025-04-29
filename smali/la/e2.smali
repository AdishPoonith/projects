.class final Lla/e2;
.super Lla/s0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lla/s0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final l:Lv9/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/d<",
            "Ls9/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lv9/g;Lda/p;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/g;",
            "Lda/p<",
            "-",
            "Lla/k0;",
            "-",
            "Lv9/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lla/s0;-><init>(Lv9/g;Z)V

    invoke-static {p2, p0, p0}, Lw9/b;->a(Lda/p;Ljava/lang/Object;Lv9/d;)Lv9/d;

    move-result-object p1

    iput-object p1, p0, Lla/e2;->l:Lv9/d;

    return-void
.end method


# virtual methods
.method protected A0()V
    .locals 1

    iget-object v0, p0, Lla/e2;->l:Lv9/d;

    invoke-static {v0, p0}, Lqa/a;->c(Lv9/d;Lv9/d;)V

    return-void
.end method
