.class public final synthetic Lu2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lu2/b0$a;

.field public final synthetic k:Lu2/b0;

.field public final synthetic l:Lu2/n;

.field public final synthetic m:Lu2/q;

.field public final synthetic n:Ljava/io/IOException;

.field public final synthetic o:Z


# direct methods
.method public synthetic constructor <init>(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/y;->j:Lu2/b0$a;

    iput-object p2, p0, Lu2/y;->k:Lu2/b0;

    iput-object p3, p0, Lu2/y;->l:Lu2/n;

    iput-object p4, p0, Lu2/y;->m:Lu2/q;

    iput-object p5, p0, Lu2/y;->n:Ljava/io/IOException;

    iput-boolean p6, p0, Lu2/y;->o:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lu2/y;->j:Lu2/b0$a;

    iget-object v1, p0, Lu2/y;->k:Lu2/b0;

    iget-object v2, p0, Lu2/y;->l:Lu2/n;

    iget-object v3, p0, Lu2/y;->m:Lu2/q;

    iget-object v4, p0, Lu2/y;->n:Ljava/io/IOException;

    iget-boolean v5, p0, Lu2/y;->o:Z

    invoke-static/range {v0 .. v5}, Lu2/b0$a;->b(Lu2/b0$a;Lu2/b0;Lu2/n;Lu2/q;Ljava/io/IOException;Z)V

    return-void
.end method
