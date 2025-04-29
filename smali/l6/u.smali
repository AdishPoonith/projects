.class public final synthetic Ll6/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/i0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll6/i0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/u;->a:Ll6/i0;

    iput-object p2, p0, Ll6/u;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Ll6/u;->a:Ll6/i0;

    iget-object v1, p0, Ll6/u;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Ll6/i0;->o(Ll6/i0;Ljava/lang/String;)Li6/j;

    move-result-object v0

    return-object v0
.end method
