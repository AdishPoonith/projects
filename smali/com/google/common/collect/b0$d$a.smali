.class Lcom/google/common/collect/b0$d$a;
.super Lcom/google/common/collect/b0$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/common/collect/b0$d;->b(I)Lcom/google/common/collect/b0$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/collect/b0$c<",
        "TK0;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/google/common/collect/b0$d;


# direct methods
.method constructor <init>(Lcom/google/common/collect/b0$d;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/common/collect/b0$d$a;->b:Lcom/google/common/collect/b0$d;

    iput p2, p0, Lcom/google/common/collect/b0$d$a;->a:I

    invoke-direct {p0}, Lcom/google/common/collect/b0$c;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Lcom/google/common/collect/v;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:TK0;V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/collect/v<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/common/collect/b0$d$a;->b:Lcom/google/common/collect/b0$d;

    invoke-virtual {v0}, Lcom/google/common/collect/b0$d;->c()Ljava/util/Map;

    move-result-object v0

    new-instance v1, Lcom/google/common/collect/b0$b;

    iget v2, p0, Lcom/google/common/collect/b0$d$a;->a:I

    invoke-direct {v1, v2}, Lcom/google/common/collect/b0$b;-><init>(I)V

    invoke-static {v0, v1}, Lcom/google/common/collect/c0;->b(Ljava/util/Map;Lb5/t;)Lcom/google/common/collect/v;

    move-result-object v0

    return-object v0
.end method
