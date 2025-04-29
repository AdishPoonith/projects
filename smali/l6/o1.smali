.class public final synthetic Ll6/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/u1;

.field public final synthetic k:[B

.field public final synthetic l:I

.field public final synthetic m:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Ll6/u1;[BILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/o1;->j:Ll6/u1;

    iput-object p2, p0, Ll6/o1;->k:[B

    iput p3, p0, Ll6/o1;->l:I

    iput-object p4, p0, Ll6/o1;->m:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ll6/o1;->j:Ll6/u1;

    iget-object v1, p0, Ll6/o1;->k:[B

    iget v2, p0, Ll6/o1;->l:I

    iget-object v3, p0, Ll6/o1;->m:Ljava/util/Map;

    invoke-static {v0, v1, v2, v3}, Ll6/u1;->j(Ll6/u1;[BILjava/util/Map;)V

    return-void
.end method
