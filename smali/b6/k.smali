.class public final synthetic Lb6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lb6/y;

.field public final synthetic k:Ls6/b;


# direct methods
.method public synthetic constructor <init>(Lb6/y;Ls6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/k;->j:Lb6/y;

    iput-object p2, p0, Lb6/k;->k:Ls6/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb6/k;->j:Lb6/y;

    iget-object v1, p0, Lb6/k;->k:Ls6/b;

    invoke-static {v0, v1}, Lb6/o;->k(Lb6/y;Ls6/b;)V

    return-void
.end method
