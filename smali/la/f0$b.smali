.class final Lla/f0$b;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lda/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lla/f0;->a(Lv9/g;Lv9/g;Z)Lv9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lda/p<",
        "Lv9/g;",
        "Lv9/g$b;",
        "Lv9/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic j:Lkotlin/jvm/internal/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/s<",
            "Lv9/g;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic k:Z


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/s;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/s<",
            "Lv9/g;",
            ">;Z)V"
        }
    .end annotation

    iput-object p1, p0, Lla/f0$b;->j:Lkotlin/jvm/internal/s;

    iput-boolean p2, p0, Lla/f0$b;->k:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lv9/g;Lv9/g$b;)Lv9/g;
    .locals 4

    instance-of v0, p2, Lla/e0;

    if-nez v0, :cond_0

    invoke-interface {p1, p2}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lla/f0$b;->j:Lkotlin/jvm/internal/s;

    iget-object v0, v0, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    check-cast v0, Lv9/g;

    invoke-interface {p2}, Lv9/g$b;->getKey()Lv9/g$c;

    move-result-object v1

    invoke-interface {v0, v1}, Lv9/g;->b(Lv9/g$c;)Lv9/g$b;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lla/f0$b;->k:Z

    check-cast p2, Lla/e0;

    if-eqz v0, :cond_1

    invoke-interface {p2}, Lla/e0;->t()Lla/e0;

    move-result-object p2

    :cond_1
    invoke-interface {p1, p2}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1

    :cond_2
    iget-object v1, p0, Lla/f0$b;->j:Lkotlin/jvm/internal/s;

    iget-object v2, v1, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    check-cast v2, Lv9/g;

    invoke-interface {p2}, Lv9/g$b;->getKey()Lv9/g$c;

    move-result-object v3

    invoke-interface {v2, v3}, Lv9/g;->f0(Lv9/g$c;)Lv9/g;

    move-result-object v2

    iput-object v2, v1, Lkotlin/jvm/internal/s;->j:Ljava/lang/Object;

    check-cast p2, Lla/e0;

    invoke-interface {p2, v0}, Lla/e0;->i(Lv9/g$b;)Lv9/g;

    move-result-object p2

    invoke-interface {p1, p2}, Lv9/g;->r(Lv9/g;)Lv9/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lv9/g;

    check-cast p2, Lv9/g$b;

    invoke-virtual {p0, p1, p2}, Lla/f0$b;->a(Lv9/g;Lv9/g$b;)Lv9/g;

    move-result-object p1

    return-object p1
.end method
