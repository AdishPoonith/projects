.class public final Lt9/j0$a;
.super Lt9/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt9/j0;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt9/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private l:I

.field private m:I

.field final synthetic n:Lt9/j0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/j0<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lt9/j0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/j0<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lt9/j0$a;->n:Lt9/j0;

    invoke-direct {p0}, Lt9/b;-><init>()V

    invoke-virtual {p1}, Lt9/a;->size()I

    move-result v0

    iput v0, p0, Lt9/j0$a;->l:I

    invoke-static {p1}, Lt9/j0;->l(Lt9/j0;)I

    move-result p1

    iput p1, p0, Lt9/j0$a;->m:I

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2

    iget v0, p0, Lt9/j0$a;->l:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lt9/b;->c()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt9/j0$a;->n:Lt9/j0;

    invoke-static {v0}, Lt9/j0;->e(Lt9/j0;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt9/j0$a;->m:I

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lt9/b;->d(Ljava/lang/Object;)V

    iget-object v0, p0, Lt9/j0$a;->n:Lt9/j0;

    iget v1, p0, Lt9/j0$a;->m:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0}, Lt9/j0;->k(Lt9/j0;)I

    move-result v0

    rem-int/2addr v1, v0

    iput v1, p0, Lt9/j0$a;->m:I

    iget v0, p0, Lt9/j0$a;->l:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lt9/j0$a;->l:I

    :goto_0
    return-void
.end method
