.class public final Ls1/v1$i;
.super Ls1/v1$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method private constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ls1/v1$f;Ls1/v1$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/q;Ljava/lang/Object;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/lang/String;",
            "Ls1/v1$f;",
            "Ls1/v1$b;",
            "Ljava/util/List<",
            "Lt2/c;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/google/common/collect/q<",
            "Ls1/v1$l;",
            ">;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Ls1/v1$h;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls1/v1$f;Ls1/v1$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/q;Ljava/lang/Object;Ls1/v1$a;)V

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ls1/v1$f;Ls1/v1$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/q;Ljava/lang/Object;Ls1/v1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p8}, Ls1/v1$i;-><init>(Landroid/net/Uri;Ljava/lang/String;Ls1/v1$f;Ls1/v1$b;Ljava/util/List;Ljava/lang/String;Lcom/google/common/collect/q;Ljava/lang/Object;)V

    return-void
.end method
