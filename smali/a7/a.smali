.class public final synthetic La7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb6/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lb6/c;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lb6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La7/a;->a:Ljava/lang/String;

    iput-object p2, p0, La7/a;->b:Lb6/c;

    return-void
.end method


# virtual methods
.method public final a(Lb6/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La7/a;->a:Ljava/lang/String;

    iget-object v1, p0, La7/a;->b:Lb6/c;

    invoke-static {v0, v1, p1}, La7/b;->b(Ljava/lang/String;Lb6/c;Lb6/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
