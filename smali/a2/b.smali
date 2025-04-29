.class final La2/b;
.super Lx1/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La2/b$b;
    }
.end annotation


# direct methods
.method public constructor <init>(Lx1/v;IJJ)V
    .locals 16

    move-object/from16 v0, p1

    invoke-static/range {p1 .. p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, La2/a;

    invoke-direct {v1, v0}, La2/a;-><init>(Lx1/v;)V

    new-instance v2, La2/b$b;

    const/4 v3, 0x0

    move/from16 v4, p2

    invoke-direct {v2, v0, v4, v3}, La2/b$b;-><init>(Lx1/v;ILa2/b$a;)V

    invoke-virtual/range {p1 .. p1}, Lx1/v;->f()J

    move-result-wide v3

    iget-wide v7, v0, Lx1/v;->j:J

    invoke-virtual/range {p1 .. p1}, Lx1/v;->d()J

    move-result-wide v13

    iget v0, v0, Lx1/v;->c:I

    const/4 v5, 0x6

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v15

    const-wide/16 v5, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v9, p3

    move-wide/from16 v11, p5

    invoke-direct/range {v0 .. v15}, Lx1/a;-><init>(Lx1/a$d;Lx1/a$f;JJJJJJI)V

    return-void
.end method
