.class public final synthetic Ll6/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/f3;

.field public final synthetic k:[B

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:Lq6/t;

.field public final synthetic o:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ll6/f3;[BIILq6/t;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/b3;->j:Ll6/f3;

    iput-object p2, p0, Ll6/b3;->k:[B

    iput p3, p0, Ll6/b3;->l:I

    iput p4, p0, Ll6/b3;->m:I

    iput-object p5, p0, Ll6/b3;->n:Lq6/t;

    iput-object p6, p0, Ll6/b3;->o:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Ll6/b3;->j:Ll6/f3;

    iget-object v1, p0, Ll6/b3;->k:[B

    iget v2, p0, Ll6/b3;->l:I

    iget v3, p0, Ll6/b3;->m:I

    iget-object v4, p0, Ll6/b3;->n:Lq6/t;

    iget-object v5, p0, Ll6/b3;->o:Ljava/util/Map;

    invoke-static/range {v0 .. v5}, Ll6/f3;->g(Ll6/f3;[BIILq6/t;Ljava/util/Map;)V

    return-void
.end method
