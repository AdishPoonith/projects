.class public final La3/g$d;
.super La3/g$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field public final u:Ljava/lang/String;

.field public final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "La3/g$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v12, p2

    move-wide/from16 v14, p4

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    invoke-static {}, Lcom/google/common/collect/q;->z()Lcom/google/common/collect/q;

    move-result-object v17

    const/4 v2, 0x0

    const-string v3, ""

    const-wide/16 v4, 0x0

    const/4 v6, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v17}, La3/g$d;-><init>(Ljava/lang/String;La3/g$d;Ljava/lang/String;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;La3/g$d;Ljava/lang/String;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "La3/g$d;",
            "Ljava/lang/String;",
            "JIJ",
            "Lw1/m;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJZ",
            "Ljava/util/List<",
            "La3/g$b;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move-wide/from16 v6, p7

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-wide/from16 v11, p12

    move-wide/from16 v13, p14

    move/from16 v15, p16

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, La3/g$e;-><init>(Ljava/lang/String;La3/g$d;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZLa3/g$a;)V

    move-object/from16 v1, p3

    iput-object v1, v0, La3/g$d;->u:Ljava/lang/String;

    invoke-static/range {p17 .. p17}, Lcom/google/common/collect/q;->v(Ljava/util/Collection;)Lcom/google/common/collect/q;

    move-result-object v1

    iput-object v1, v0, La3/g$d;->v:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public g(JI)La3/g$d;
    .locals 20

    move-object/from16 v0, p0

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move-wide/from16 v2, p1

    :goto_0
    iget-object v4, v0, La3/g$d;->v:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_0

    iget-object v4, v0, La3/g$d;->v:Ljava/util/List;

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La3/g$b;

    move/from16 v7, p3

    invoke-virtual {v4, v2, v3, v7}, La3/g$b;->g(JI)La3/g$b;

    move-result-object v5

    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-wide v4, v4, La3/g$e;->l:J

    add-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    move/from16 v7, p3

    new-instance v19, La3/g$d;

    move-object/from16 v1, v19

    iget-object v2, v0, La3/g$e;->j:Ljava/lang/String;

    iget-object v3, v0, La3/g$e;->k:La3/g$d;

    iget-object v4, v0, La3/g$d;->u:Ljava/lang/String;

    iget-wide v5, v0, La3/g$e;->l:J

    iget-object v10, v0, La3/g$e;->o:Lw1/m;

    iget-object v11, v0, La3/g$e;->p:Ljava/lang/String;

    iget-object v12, v0, La3/g$e;->q:Ljava/lang/String;

    iget-wide v13, v0, La3/g$e;->r:J

    move-object v9, v8

    iget-wide v7, v0, La3/g$e;->s:J

    move-wide v15, v7

    iget-boolean v7, v0, La3/g$e;->t:Z

    move/from16 v17, v7

    move/from16 v7, p3

    move-object/from16 v18, v9

    move-wide/from16 v8, p1

    invoke-direct/range {v1 .. v18}, La3/g$d;-><init>(Ljava/lang/String;La3/g$d;Ljava/lang/String;JIJLw1/m;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    return-object v19
.end method
