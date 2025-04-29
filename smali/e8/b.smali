.class public final synthetic Le8/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Le8/c;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:I

.field public final synthetic m:Le8/c$f;

.field public final synthetic n:Ljava/nio/ByteBuffer;

.field public final synthetic o:J


# direct methods
.method public synthetic constructor <init>(Le8/c;Ljava/lang/String;ILe8/c$f;Ljava/nio/ByteBuffer;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le8/b;->j:Le8/c;

    iput-object p2, p0, Le8/b;->k:Ljava/lang/String;

    iput p3, p0, Le8/b;->l:I

    iput-object p4, p0, Le8/b;->m:Le8/c$f;

    iput-object p5, p0, Le8/b;->n:Ljava/nio/ByteBuffer;

    iput-wide p6, p0, Le8/b;->o:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Le8/b;->j:Le8/c;

    iget-object v1, p0, Le8/b;->k:Ljava/lang/String;

    iget v2, p0, Le8/b;->l:I

    iget-object v3, p0, Le8/b;->m:Le8/c$f;

    iget-object v4, p0, Le8/b;->n:Ljava/nio/ByteBuffer;

    iget-wide v5, p0, Le8/b;->o:J

    invoke-static/range {v0 .. v6}, Le8/c;->i(Le8/c;Ljava/lang/String;ILe8/c$f;Ljava/nio/ByteBuffer;J)V

    return-void
.end method
