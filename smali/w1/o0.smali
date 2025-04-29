.class public final Lw1/o0;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field public final j:Lo3/p;

.field public final k:Landroid/net/Uri;

.field public final l:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field public final m:J


# direct methods
.method public constructor <init>(Lo3/p;Landroid/net/Uri;Ljava/util/Map;JLjava/lang/Throwable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo3/p;",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;J",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p6}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    iput-object p1, p0, Lw1/o0;->j:Lo3/p;

    iput-object p2, p0, Lw1/o0;->k:Landroid/net/Uri;

    iput-object p3, p0, Lw1/o0;->l:Ljava/util/Map;

    iput-wide p4, p0, Lw1/o0;->m:J

    return-void
.end method
