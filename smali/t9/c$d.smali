.class final Lt9/c$d;
.super Lt9/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lt9/c<",
        "TE;>;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field private final k:Lt9/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/c<",
            "TE;>;"
        }
    .end annotation
.end field

.field private final l:I

.field private m:I


# direct methods
.method public constructor <init>(Lt9/c;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/c<",
            "+TE;>;II)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lt9/c;-><init>()V

    iput-object p1, p0, Lt9/c$d;->k:Lt9/c;

    iput p2, p0, Lt9/c$d;->l:I

    sget-object v0, Lt9/c;->j:Lt9/c$a;

    invoke-virtual {p1}, Lt9/a;->size()I

    move-result p1

    invoke-virtual {v0, p2, p3, p1}, Lt9/c$a;->c(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Lt9/c$d;->m:I

    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lt9/c$d;->m:I

    return v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    sget-object v0, Lt9/c;->j:Lt9/c$a;

    iget v1, p0, Lt9/c$d;->m:I

    invoke-virtual {v0, p1, v1}, Lt9/c$a;->a(II)V

    iget-object v0, p0, Lt9/c$d;->k:Lt9/c;

    iget v1, p0, Lt9/c$d;->l:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lt9/c;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
