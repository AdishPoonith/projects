.class public final synthetic Lb6/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/b;


# instance fields
.field public final synthetic a:Lb6/o;

.field public final synthetic b:Lb6/c;


# direct methods
.method public synthetic constructor <init>(Lb6/o;Lb6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/m;->a:Lb6/o;

    iput-object p2, p0, Lb6/m;->b:Lb6/c;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lb6/m;->a:Lb6/o;

    iget-object v1, p0, Lb6/m;->b:Lb6/c;

    invoke-static {v0, v1}, Lb6/o;->j(Lb6/o;Lb6/c;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
