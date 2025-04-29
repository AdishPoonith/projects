.class public final synthetic Lb6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/a$a;


# instance fields
.field public final synthetic a:Ls6/a$a;

.field public final synthetic b:Ls6/a$a;


# direct methods
.method public synthetic constructor <init>(Ls6/a$a;Ls6/a$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb6/a0;->a:Ls6/a$a;

    iput-object p2, p0, Lb6/a0;->b:Ls6/a$a;

    return-void
.end method


# virtual methods
.method public final a(Ls6/b;)V
    .locals 2

    iget-object v0, p0, Lb6/a0;->a:Ls6/a$a;

    iget-object v1, p0, Lb6/a0;->b:Ls6/a$a;

    invoke-static {v0, v1, p1}, Lb6/d0;->d(Ls6/a$a;Ls6/a$a;Ls6/b;)V

    return-void
.end method
