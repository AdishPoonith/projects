.class public final Ly2/d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1c
    name = "a"
.end annotation


# instance fields
.field public final a:Ls1/n1;

.field public final b:Lcom/google/common/collect/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/q<",
            "Ly2/b;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ly2/k;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lw1/m$b;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ly2/e;",
            ">;"
        }
    .end annotation
.end field

.field public final g:J

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly2/e;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly2/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ls1/n1;Ljava/util/List;Ly2/k;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;Ljava/util/List;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ls1/n1;",
            "Ljava/util/List<",
            "Ly2/b;",
            ">;",
            "Ly2/k;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Lw1/m$b;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ly2/e;",
            ">;",
            "Ljava/util/List<",
            "Ly2/e;",
            ">;",
            "Ljava/util/List<",
            "Ly2/e;",
            ">;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/d$a;->a:Ls1/n1;

    invoke-static {p2}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object p1

    iput-object p1, p0, Ly2/d$a;->b:Lcom/google/common/collect/q;

    iput-object p3, p0, Ly2/d$a;->c:Ly2/k;

    iput-object p4, p0, Ly2/d$a;->d:Ljava/lang/String;

    iput-object p5, p0, Ly2/d$a;->e:Ljava/util/ArrayList;

    iput-object p6, p0, Ly2/d$a;->f:Ljava/util/ArrayList;

    iput-object p7, p0, Ly2/d$a;->h:Ljava/util/List;

    iput-object p8, p0, Ly2/d$a;->i:Ljava/util/List;

    iput-wide p9, p0, Ly2/d$a;->g:J

    return-void
.end method
